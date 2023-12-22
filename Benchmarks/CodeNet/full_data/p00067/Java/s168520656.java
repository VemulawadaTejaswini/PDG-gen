import java.util.*;
import java.io.*;

public class Main{
	public static char[][] newMap(char[][] map, int[] x){
		Set<int[]> list = new HashSet<int[]>();
		list.add(x);
		map[x[0]][x[1]] = '0';
		while( list.size() != 0 ){
			Set<int[]> added = new HashSet<int[]>(list);
			list.clear();
			for(int[] now : added){
				if( now[0] == 0 ){
					if( map[now[0]+1][now[1]] == '1' ){
						int[] a = {now[0]+1,now[1]};
						list.add(a);
					}
					if( now[1] == 0 ){
						if( map[now[0]][now[1]+1] == '1' ){
							int[] a = {now[0],now[1]+1};
							list.add(a);							
						}					
					} else if( now[1] == 11 ){
						if( map[now[0]][now[1]-1] == '1' ){
							int[] a = {now[0],now[1]+1};
							list.add(a);						
						}
					} else {
						if( map[now[0]][now[1]+1] == '1' ){
							int[] a = {now[0],now[1]+1};
							list.add(a);						
						}
						if( map[now[0]][now[1]-1] == '1' ){
							int[] a = {now[0],now[1]+1};
							list.add(a);						
						}
					}
				} else if( now[0] == 11 ){
					if( map[now[0]-1][now[1]] == '1' ){
						int[] a = {now[0]-1,now[1]};
						list.add(a);						
					}
					if( now[1] == 0 ){
						if( map[now[0]][now[1]+1] == '1' ){
							int[] a = {now[0],now[1]+1};
							list.add(a);						
						}
					} else if( now[1] == 11 ){
						if( map[now[0]][now[1]-1] == '1' ){
							int[] a = {now[0],now[1]+1};
							list.add(a);							
						}	
					} else {
						if( map[now[0]][now[1]+1] == '1' ){
							int[] a = {now[0],now[1]+1};
							list.add(a);							
						}
						if( map[now[0]][now[1]-1] == '1' ){
							int[] a = {now[0],now[1]-1};
							list.add(a);							
						}
					}
				} else {
					if( map[now[0]+1][now[1]] == '1' ){
						int[] a = {now[0]+1,now[1]};
						list.add(a);						
					}
					if( map[now[0]-1][now[1]] == '1' ){
						int[] a = {now[0]-1,now[1]};
						list.add(a);					
					}
					if( now[1] == 0 ){
						if( map[now[0]][now[1]+1] == '1' ){
							int[] a = {now[0],now[1]+1};
							list.add(a);							
						}
					} else if( now[1] == 11 ){
						if( map[now[0]][now[1]-1] == '1' ){
							int[] a = {now[0],now[1]-1};
							list.add(a);						
						}
					} else {
						if( map[now[0]][now[1]+1] == '1' ){
							int[] a = {now[0],now[1]+1};
							list.add(a);						
						}
						if( map[now[0]][now[1]-1] == '1' ){
							int[] a = {now[0],now[1]-1};
							list.add(a);						
						}
					}
				}
				for(int[] p : list){
					map[p[0]][p[1]] = '0';
				}
			}
		}
		return map;
	}
					
	public static int judge(String[] s){
		char[][] map = new char[12][12];
		int count = 0;
		for(int i = 0; i < 12; i++){
			map[i] = s[i].toCharArray();
		}
		for(int i = 0; i < 12; i++){
			for(int j = 0; j < 12; j++){
				if( map[i][j] == '1' ){
					count++;
					int[] a = {i,j};
					map = newMap(map,a);
				/*	for(char[] x : map){
						for(char y : x){
							System.out.print(y);
						}
						System.out.println();
					}
					System.out.println();*/
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		List<Integer> result = new ArrayList<Integer>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			String[] s = new String[12];
			for(int i = 0; i < 12; i++){
				s[i] = stdIn.next();
			}
			result.add(judge(s));
			while( stdIn.hasNext() ){
				stdIn.nextLine();
				for(int i = 0; i < 12; i++){
					s[i] = stdIn.next();
				}
			        result.add(judge(s));
		   	}
			for(Integer count : result){
				System.out.println(count);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}