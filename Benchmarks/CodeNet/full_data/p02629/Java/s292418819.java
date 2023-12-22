import java.util.*;
class Main {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
        int div=n;
        int rem=0;
      StringBuilder res=new StringBuilder("");
        while(true)
        {
            rem=(div-1)%26;
            div=(div-1)/26;
            char c=(char)(rem+'a');
            res.append(c);
            if(div==0)break;
            
        }
        res.reverse().toString();
        System.out.println(res);
	}}