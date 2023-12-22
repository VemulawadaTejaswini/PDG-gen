import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s ="ACL";
        String t="";
        int n = sc.nextInt();
    	for(int k=1;k<=n;k++){
            t += s;
        }
        System.out.println(t);
    }
}