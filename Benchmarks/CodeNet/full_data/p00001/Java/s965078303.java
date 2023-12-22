import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
class Main{
    public static void main(String args[]){
	try{
	    int x[] = new int[10];
	    int a[] = {0,0,0};
	    int temp;
	    InputStreamReader is = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(is);
	    for(int i=0;i<10;i++){
		x[i] = Integer.parseInt(br.readLine());
		if(a[0] < x[i]){
		    temp = a[0];
		    a[0] = x[i];
		    x[i] = temp;
		}
		if(a[1] < x[i]){
		    temp = a[1];
		    a[1] = x[i];
		    x[i] = temp;
		}
		if(a[2] < x[i]){
		    temp = a[2];
		    a[2] = x[i];
		    x[i] = temp;
		}
	    }
	    System.out.println(a[0]);
	    System.out.println(a[1]);
	    System.out.println(a[2]);
	}
	catch(Exception e){
	    System.out.printf("error");
	}
    }
}