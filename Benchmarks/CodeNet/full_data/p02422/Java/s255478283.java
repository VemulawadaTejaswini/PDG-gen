import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Word w=new Word(sc.next());
        int q=sc.nextInt();
        String com;
        for(int i=0;i<q;i++){
            com=sc.next();
            if(com.equals("replace")){
                w.replace(sc.nextInt(),sc.nextInt(),sc.next());
            }else if(com.equals("reverse")){
                w.reverse(sc.nextInt(),sc.nextInt());
            }else if(com.equals("print")){
                w.print(sc.nextInt(),sc.nextInt());
            }
        }
    }
}
class Word{
    private char[] c;
    Word(String s){
        this.c=s.toCharArray();
    }
    void replace(int a,int b,String r){
        for(int i=0;i<=b-a;i++)this.c[i+a]=r.charAt(i);
    }
    void reverse(int a,int b){
        char tmp;
        int i,j;
        for(i=a,j=b;i<j;i++,j--){
            tmp=this.c[i];
            this.c[i]=this.c[j];
            this.c[j]=tmp;
        }
    }
    void print(int a,int b){
        for(int i=a;i<=b;i++)System.out.printf("%c",this.c[i]);
        System.out.printf("\n");
    }
}
