import java.util.*;

public class Main{
	public static void main(String args[]){
     	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	char[] c = sc.next().toCharArray();
        int count = 0;
       int extra = 0;
      	int len = c.length;
        for(char ch: c){
            if(ch=='W')
            count++;
        }
      	for(int i =len-1;i>=len-count;i--){
            if(c[i]=='W')
            extra++;
        }
       if(count-extra < len/2)
        System.out.println(count-extra);
      else{
        System.out.println(len-count+extra);
      }
    }
}
