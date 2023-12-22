import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    while(true){
		int w, h, num = 0;
		String[] st = sc.readLine().split(" ");
		w = Integer.valueOf(st[0]);
		h = Integer.valueOf(st[1]);
		if((w|h)==0)
		    break;
		int[][] map = new int[h][w];
		int[][] dist = new int[h][w];
		int gi=0, gj=0;
		ArrayList<int[]> rem = new ArrayList<int[]>();
		for(int j=0; j<h; j++){
		    String[] ap = sc.readLine().split(" ");
		    for(int i=0; i<w; i++){
			if(ap[i].charAt(0)=='S'){
			    map[j][i] = 0;
			    dist[j][i] = 0;
			    rem.add(new int[]{j, i});
			}
			else if(ap[i].charAt(0)=='G'){
			    gi = i; gj = j;
			}
			else if(Character.isDigit(ap[i].charAt(0))){
			    map[j][i] = Integer.valueOf(ap[i]);
			    num = Math.max(num, map[j][i]);
			}
			else
			    map[j][i] = 0;
		    }
		}
		map[gj][gi] = num+1;
		for(int z=1; z<=num+1; z++){
		    ArrayList<int[]> now = new ArrayList<int[]>();
		    for(int j=0; j<h; j++)
			for(int i=0; i<h; i++){
			    if(map[j][i]!=z)
				continue;
			    now.add(new int[]{j, i});
			    int min = Integer.MAX_VALUE;
			    for(int[] a:rem)
				min = Math.min(min, dist[a[0]][a[1]]+Math.abs(a[0]-j)+Math.abs(a[1]-i));
			    dist[j][i] = min;
			}
		    rem = now;
		}
		System.out.println(dist[gj][gi]);
	    }
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}