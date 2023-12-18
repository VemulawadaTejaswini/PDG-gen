import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        String a="dream";
        String b="dreamer";
        String c="erase";
        String d="eraser";
        int index=S.length()-1;
        while(true){
            if(S.lastIndexOf(a,index) != -1 && S.lastIndexOf(a,index) == (index-4)){
                index-=5;
            }else if(S.lastIndexOf(b,index) != -1 && S.lastIndexOf(b,index) == (index-6)){
                index-=7;
            }else if(S.lastIndexOf(c,index) != -1 && S.lastIndexOf(c,index) == (index-4)){
                index-=5;
            }else if(S.lastIndexOf(d,index) != -1 && S.lastIndexOf(d,index) == (index-5)){
                index-=6;
            }else if(index == -1){
                System.out.println("YES");
                break;
            }else{
                System.out.println("No");
                break;
            }
        }
    }
}