import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	String strArr[] = br.readLine().split(" ");
        	int[] a=new int[4];

        	for(int j=0; j<4; j++){
        		a[j]=Integer.parseInt(strArr[j]);
        	}

        	for(int i=0;i<4-1;i++){
        	      for(int j=4-1;j>i;j--){

        		if(a[j]<a[j-1]){
        		  int t=a[j];
        		  a[j]=a[j-1];
        		  a[j-1]=t;
        		}
        	  }
        	}

        	if(a[0]==a[1] && a[2]== a[3]){
        		System.out.println("yes");
        	}
        	else{
        		System.out.println("no");
        	}
    }
}