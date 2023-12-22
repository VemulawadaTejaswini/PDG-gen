import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	public static class Rectangle{
		int w, h;

		public Rectangle(int w, int h) {
			super();
			this.w = w;
			this.h = h;
		}
		
		public boolean isDupulicate(Rectangle another){
			if(this.w >= another.w && this.h >= another.h){
				return true;
			}else{
				return false;
			}
		}

		@Override
		public String toString() {
			return "[" + w + " , " + h + "]";
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			boolean[][] is_wall = new boolean[5][5];
			
			for(int j = 0; j < 5; j++){
				for(int k = 0; k < 5; k++){
					is_wall[j][k] = sc.nextInt() == 0;
				}
			}
			
			ArrayList<ArrayList<LinkedList<Rectangle>>> map = new ArrayList<ArrayList<LinkedList<Rectangle>>>(5);
			for(int j = 0; j < 5; j++){
				ArrayList<LinkedList<Rectangle>> tmp = new ArrayList<LinkedList<Rectangle>>(5);
				for(int k = 0; k < 5; k++){
					tmp.add(new LinkedList<Rectangle>());
				}
				map.add(tmp);
			}
			
			for(int j = 0; j < 5; j++){
				for(int k = 0; k < 5; k++){
					if(is_wall[j][k]){
						map.get(j).get(k).add(new Rectangle(0,0));
					}else{
						
						if(j == 0 && k == 0){
							map.get(j).get(k).add(new Rectangle(1,1));
						}else if(j == 0){
							for(Rectangle r : map.get(j).get(k-1)){
								map.get(j).get(k).add(new Rectangle(r.w + 1, r.h));
							}
						}else if(k == 0){
							for(Rectangle r : map.get(j - 1).get(k)){
								map.get(j).get(k).add(new Rectangle(r.w, r.h + 1));
							}
						}else{
							if(!is_wall[j][k-1] && !is_wall[j-1][k] && !is_wall[j-1][k-1]){
								int col_min = Integer.MAX_VALUE;
								int row_min = Integer.MAX_VALUE;
								/*
								for(Rectangle r : map.get(j - 1).get(k - 1)){
									map.get(j).get(k).add(new Rectangle(r.w + 1, r.h + 1));
									col_min = Math.min(col_min, r.w+1);
									row_min = Math.min(row_min, r.h+1);
								}
								*/
								for(Rectangle r : map.get(j - 1).get(k)){
									map.get(j).get(k).add(new Rectangle(r.w, r.h + 1));
									row_min = Math.min(row_min, r.h+1);
									
								}
								for(Rectangle r : map.get(j).get(k - 1)){
									map.get(j).get(k).add(new Rectangle(r.w + 1, r.h));
									col_min = Math.min(col_min, r.w+1);
								}
								
								for(Iterator<Rectangle> iter = map.get(j).get(k).iterator(); iter.hasNext(); ){
									Rectangle rect = iter.next();
									
									if(rect.w > col_min || rect.h > row_min){
										iter.remove();
									}
								}
								
								for(int l = 0; l < map.get(j).get(k).size(); l++){
									Rectangle rect = map.get(j).get(k).get(l);
									
									if(rect == null){
										break;
									}
									
									for(Iterator<Rectangle> iter = map.get(j).get(k).iterator(); iter.hasNext(); ){
										Rectangle rect2 = iter.next();
										
										if(rect.isDupulicate(rect2) && rect != rect2){
											iter.remove();
										}
									}
								}
								
							}else if(is_wall[j][k-1] && is_wall[j-1][k]){
								map.get(j).get(k).add(new Rectangle(1, 1));
							}else{
								
								if(is_wall[j-1][k-1] || is_wall[j-1][k]){
									for(Rectangle r : map.get(j).get(k - 1)){
										map.get(j).get(k).add(new Rectangle(r.w + 1, 1));
									}
								}
								
								if(is_wall[j-1][k-1] || is_wall[j][k-1]){
									for(Rectangle r : map.get(j - 1).get(k)){
										map.get(j).get(k).add(new Rectangle(1, r.h + 1));
									}
								}
							}
							
							
						}
						
					}
				}
			}
			
			int max = 0;
			
			for(int j = 0; j < 5; j++){
				for(int k = 0; k < 5; k++){
					for(Rectangle r : map.get(j).get(k)){
						max = Math.max(max, r.w * r.h);
					}
				}
			}
			
			System.out.println(max);
			
		}
		
		
	}

}