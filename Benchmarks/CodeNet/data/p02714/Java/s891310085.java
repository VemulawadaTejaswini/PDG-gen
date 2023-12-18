import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),count=0;
    String s=sc.next(),s1="",s2="",s3="";
    for(int i=0;i<n-2;i++) {
    	s1=s.substring(i, i+1);
    	for(int j=i+1;j<n-1;j++) {
    		s2=s.substring(j, j+1);
    		if(s1.equals(s2))continue;
    		for(int k=j+1;k<n;k++) {
    			if(k==2*j-i)continue;
    			s3=s.substring(k, k+1);
    			if(!s2.equals(s3)&&!s1.equals(s3)) {
    				if(j-i!=k-j)count++;
    				//System.out.println(i+" "+j+" "+k);
    			}
    		}
    	}
    }
    System.out.println(count);
  }
}