import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);       //（１）
        BufferedReader br = new BufferedReader(is);
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        String[] a_str = br.readLine().split(" ",-1);
        int max = 0;
        int max_index = 0;
        for(int i = 0;i<N;i++){
        	a[i] = Integer.parseInt(a_str[i]);
        }
        while(true){
        	for(int i = 0;i<N;i++){
            	if(a[i]>max){
            		max = a[i];
            		max_index = i;
            	}
        	}
        	int[] b = new int[N];
        	int j = 0;
        	for(int i = max_index+1;i<N;i++){
        		b[j] = a[i];
        		j++;
        	}
        	for(int i = 0;i<max_index+1;i++){
        		b[j] = a[i];
        		j++;
        	}
        	boolean yes_flag = true;
        	boolean no_flag = false;
        	for(int i = 0;i<N;i++){
        		b[i] = b[i]-(i+1);
        		if(b[i]<0){
        			no_flag = true;
        			break;
        		}else if(b[i]!=0){
        			yes_flag=false;
        		}
        	}
        	if(no_flag){
        		System.out.println("NO");
        		break;
        	}
        	if(yes_flag){
        		System.out.println("YES");
        		break;
        	}
        }
	}
}
