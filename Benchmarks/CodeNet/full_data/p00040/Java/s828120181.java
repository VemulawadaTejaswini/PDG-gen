
import java.util.ArrayList;
import java.util.Scanner;



 class Main{
     
    static  ArrayList<String> al=new ArrayList<String>();
    static int A=1,B=0;
    static char chars[]= new char[]{
         'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
         'q','r','s','t','u','v','w','x','y','z'
     };
    static char getChar(int n){return chars[n];}
    static int getCode(char c){return (int)c-(int)'a';}
    static int F(int m){return (A*m+B)%26;}
    static String replace(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<str.length(); i++){
           // System.out.println(str.charAt(i)+" "+F(getCode(str.charAt(i))));
            char replaced = getChar(F(getCode(str.charAt(i))));
            //System.out.println(replaced);
            sb.append(replaced);
        }        return new String(sb);
    }
    static void detectAB(){
        for(int a=1; a<30000;a+=2){
            for(int b=0; b<26;b++){
                A=a;B=b;
                for(String str:al){
                    String rep = replace(str);
                    //System.out.println(rep);
                    if(rep.equals("this")||rep.equals("that"))return;
                }
            }
        }
    }
    
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        // System.out.println(getCode('a')+""+getCode('b')+""+getCode('z'));
         //System.out.println(replace("abz"));
         //String line;
         int n=sc.nextInt();
         //int n=1;
         for(int i=0; i<n;i++){
             //System.out.println("aa"+n);
             al.clear();
             String line=sc.nextLine();
             //System.out.println(line);
             String split[]=line.split(" ");
             for(String str:split)if(str.length()==4)al.add(str);
            detectAB();
             System.out.print(replace(split[0]));
            for(int j=1; j<split.length;j++){
                System.out.print(" "+replace(split[j]));
            }
         }
         
         
     }
     
 }