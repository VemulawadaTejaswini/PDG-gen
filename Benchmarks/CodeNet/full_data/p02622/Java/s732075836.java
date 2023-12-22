import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    int ans=0;
    char c1[]=s.toCharArray();
    char c2[]=t.toCharArray();
    for(int i=0;i<c1.length;i++)
        {
            if(c1[i]==c2[i]){
                
            }
            else{
                ans++;
            }
        }
    System.out.println(ans);
	}
}
