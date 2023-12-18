import java.util.*;
class Main{
	public static void main(String[]args){
    	Scanner in = new Scanner(System.in);
      	int h = in.nextInt(), n = in.nextInt(),s=0;
      	int[] a = new int[n];
      	for(int i = 0 ; i < n ; i++){
          a[i] = in.nextInt();s+=a[i];}
      	System.out.println((s>=h)?"Yes":"No");
    }
}