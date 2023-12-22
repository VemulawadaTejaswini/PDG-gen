import java.util.*;

public class Main {

    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	while(s.hasNext()){
	    int num = s.nextInt();
	    int[][] data  = new int[num][2];
	    for(int i=0 ; i<num ; i++)
		data[i][1] = i+1;
	    for(int i=0 ; i<num*(num-1)/2 ; i++){
		int[] a = new int[4];
		for(int j=0 ; j<4 ; j++)
		    a[j] = s.nextInt();
		if(a[2]>a[3])
		    data[a[0]-1][0]+=3;
		if(a[2]<a[3])
		    data[a[1]-1][0]+=3;
		else{
		    data[a[0]-1][0]+=3;
		    data[a[1]-1][0]+=1;
		}
	    }
	    Arrays.sort(data,0);
	    for(int i=0 ; i<num ; i++){
		System.out.println(data[i][1]);
	    }
	}
    }
}