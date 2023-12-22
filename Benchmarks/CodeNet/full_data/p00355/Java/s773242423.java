import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
	    String str=reader.readLine();
	    String s1[]=str.split(" ");
	    int a=Integer.parseInt(s1[0]);
	    int b=Integer.parseInt(s1[1]);

	    int count=Integer.parseInt(reader.readLine());
	    int s[]=new int[count];
	    int f[]=new int[count];
	    int tf=0;
	    for(int i=0;i<count;i++){
		String str2=reader.readLine();
		String s2[]=str2.split(" ");
		s[i]=Integer.parseInt(s2[0]);
		f[i]=Integer.parseInt(s2[1]);
	    }

	    for(int i=0;i<count;i++){
		if(s[i]==a||f[i]==b){
		    tf=1;
		    break;
		}else if(s[i]<a&&a<f[i]){
		    tf=1;
		    break;
		}else if(s[i]<b&&b<f[i]){
		    tf=1;
		    break;
		}else if(a<s[i]&&f[i]<b){
		    tf=1;
		    break;
		}else if(s[i]<a&&b<f[i]){
		    tf=1;
		    break;
		}
	    }
	    System.out.println(tf);
	    
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int gcd (int a, int b){
	return b>0?gcd(b,a%b):a;
    }
    static int lcm (int a, int b) {
	return a*b/gcd(a,b);
    }
}

