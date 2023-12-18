import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt()-1;
        int b=sc.nextInt()-1;
        int c=sc.nextInt()-1;
        int d=sc.nextInt()-1;
        String[]s=sc.next().split("",0);
        if(c<d){
            boolean po=true;
            if(c-a>2){
                for(int i=a+1;i<c-1;i++){
                    if((s[i]+s[i+1]).equals("#")){
                        po=false;
                        break;
                    }
                } 
            }
            if(d-b>2){
                for(int i=b+1;i<d-1;i++){
                    if((s[i]+s[i+1]).equals("##")){
                        po=false;
                        break;
                    }
                } 
            }
            System.out.println(po?"Yes":"No");
        }
        else{
            boolean po=true;
            if(c-a>2){
                for(int i=a+1;i<c-1;i++){
                    if((s[i]+s[i+1]).equals("##")){
                        po=false;
                        break;
                    }
                } 
            }
            if(po){
                po=false;
                for(int i=b-1;i<d;i++){
                    //System.out.println(s[i]+s[i+1]+s[i+2]);
                    if((s[i]+s[i+1]+s[i+2]).equals("...")){
                        po=true;
                        break;
                    }
                } 
            }
            System.out.println(po?"Yes":"No");
        }
    }
}
