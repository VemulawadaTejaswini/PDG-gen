import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
 
	public static void main(String[] args) throws Throwable {
		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));
    String cd= vd.readLine()
    String[] s = cd.split("");
    int sum =0;
    for(int i=0;i<s.length;i++){
      sum=sum+Integer.parseInt(s[i]);
    }
    int p = Integer.parseInt(cd);
    if(p%sum==0)System.out.pringln("Yes");
    if(p%sum!=0)System.out.pringln("No");
  }
}