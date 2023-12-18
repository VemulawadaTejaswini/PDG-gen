import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][3];
		for(int i=0;i<n;i++){
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			arr[i][2] = sc.nextInt();
		}
		
		int h = 0;
		boolean val=true;
		L1:for(int x=0;x<=100;x++){
			for(int y=0;y<=100;y++){
				val=true;
				for(int i=0;i<n;i++){
					int num = Math.abs(x-arr[i][0])+Math.abs(y-arr[i][1])+arr[i][2];
					if(i==0){
						h = Math.abs(x-arr[i][0])+Math.abs(y-arr[i][1])+arr[i][2];
					}
					else{
						if(num!=h){
							val=false;
							break;
						}
					}
				}
				if(val && h>=1){
					System.out.println(x+" "+y+" "+h);
					break L1;
				}
			}
		}
	}
}
/*
4
2 3 5
2 1 5
1 2 5
3 2 5
*/