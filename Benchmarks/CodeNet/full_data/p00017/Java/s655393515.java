import java.util.Scanner;
public class Main
{
		public static boolean f1(char a,char b,char c) {
			if(a>'z')a-=26;if(b>'z')b-=26;if(c>'z')c-=26;
			if(a=='t' && b=='h' && c=='e')return true;
			return false;
		}
		public static boolean f2(char a,char b,char c,char d) {
			if(a>'z')a-=26;if(b>'z')b-=26;if(c>'z')c-=26;if(d>'z')d-=26;
			if(a=='t' && b=='h' && c=='i' && d=='s')return true;
			return false;
		}
		public static boolean f3(char a,char b,char c,char d) {
			if(a>'z')a-=26;if(b>'z')b-=26;if(c>'z')c-=26;if(d>'z')d-=26;
			if(a=='t' && b=='h' && c=='a' && d=='t')return true;
			return false;
		}
        public static void main(String args[]) throws Exception
        {
        		int an=0,i;
                Scanner cin=new Scanner(System.in);
                while(cin.hasNext()) {
                	an=0;
                	String str=cin.nextLine(),tp;
                	for(i=0; i<26; ++i) {
                		tp=str;
                		boolean aa=false,bb=false,cc=false;
                		for(int j=0; j<str.length()-2; ++j) {
                			if(f1((char)(tp.charAt(j)+i),(char)(tp.charAt(j+1)+i),(char)(tp.charAt(j+2)+i))) {
                				cc=true;
                			}
                			if(j!=str.length()-3) {
                				if(f2((char)(tp.charAt(j)+i),(char)(tp.charAt(j+1)+i),(char)(tp.charAt(j+2)+i),(char)(tp.charAt(j+3)+i))) {
                					aa=true;
                				}
                				if(f3((char)(tp.charAt(j)+i),(char)(tp.charAt(j+1)+i),(char)(tp.charAt(j+2)+i),(char)(tp.charAt(j+3)+i))) {
                					bb=true;
                				}
                			}
                		}
                		if(aa || bb || cc){
                			an=i;
                			break;
                		}
                	}
                	for(i=0; i<str.length(); ++i) {
                    	if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                    		if(str.charAt(i)+an>'z')
                    			System.out.print((char)(str.charAt(i)+an-26));
                    		else System.out.print((char)(str.charAt(i)+an));
                    	}
                    	else System.out.print((char)str.charAt(i));
                    }
                    System.out.println();
                }
                cin.close();
        }
}
