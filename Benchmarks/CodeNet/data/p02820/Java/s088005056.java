import java.util.Scanner;
public class Main
{
        public static void main(String args[]) throws Exception
        {
                Scanner cin=new Scanner(System.in);
                int n,k;
                long r,s,p,sum=0;
                String str;
                char ch[]=new char[200050];
                n=cin.nextInt();
                k=cin.nextInt();
                r=cin.nextInt();
                s=cin.nextInt();
                p=cin.nextInt();
                str=cin.next();
                cin.close();
                for(int i=0; i<k; ++i) {
            		if(str.charAt(i)=='r') {
            			sum+=p;
            			ch[i]='p';
            		}
            		if(str.charAt(i)=='s') {
            			sum+=r;
            			ch[i]='r';
            		}
            		if(str.charAt(i)=='p') {
            			sum+=s;
            			ch[i]='s';
            		}
                }
                for(int i=k; i<n-k; ++i) {
                	if(str.charAt(i)=='r') {
                		if(ch[i-k]=='p') {
                			if(str.charAt(i+k)=='s')
                				ch[i]='s';
                			if(str.charAt(i+k)=='r')
                				ch[i]='r';
                			if(str.charAt(i+k)=='p')
                				ch[i]='r';
                		}
                		else {
                			sum+=p;
                			ch[i]='p';
                		}
                	}
                	if(str.charAt(i)=='s') {
                		if(ch[i-k]=='r') {
                			if(str.charAt(i+k)=='s')
                				ch[i]='s';
                			if(str.charAt(i+k)=='r')
                				ch[i]='s';
                			if(str.charAt(i+k)=='p')
                				ch[i]='p';
                		}
                		else {
                			sum+=r;
                			ch[i]='r';
                		}
                	}
                	if(str.charAt(i)=='p') {
                		if(ch[i-k]=='s') {
                			if(str.charAt(i+k)=='s')
                				ch[i]='p';
                			if(str.charAt(i+k)=='r')
                				ch[i]='r';
                			if(str.charAt(i+k)=='p')
                				ch[i]='r';
                		}
                		else {
                			sum+=s;
                			ch[i]='s';
                		}
                	}
                }
                for(int i=n-k; i<n; ++i) {
                	if(str.charAt(i)=='r') {
                		if(i-k<0)
                			sum+=p;
                		else if(ch[i-k]!='p')
                			sum+=p;
            		}
            		if(str.charAt(i)=='s') {
            			if(i-k<0)
            				sum+=r;
            			else if(ch[i-k]!='r')
            				sum+=r;
            		}
            		if(str.charAt(i)=='p') {
            			if(i-k<0)
            				sum+=s;
            			else if(ch[i-k]!='s')
            				sum+=s;
            		}
                }
                System.out.println(sum);
        }
}