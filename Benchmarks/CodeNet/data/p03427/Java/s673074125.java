import java.util.*;
public class Main{
    public static void main(String[]args){  
    Scanner sc=new Scanner(System.in);
    String num=sc.next();
    Long nu=Long.parseLong(num);
    char[]s=num.toCharArray();
    long[]aa=new long[num.length()];
    for(int i=0;i<num.length();i++){
        aa[(int)i]=Long.parseLong(""+s[(int)i]);
    }
    long mm=0;
    aa[0]=aa[0]-1;
    if(aa[0]==0){
        aa[0]++;
        aa[1]=aa[1]-1;
        for(int i=2;i<num.length();i++){
            aa[i]=9;
        }
        for(int i=0;i<num.length();i++){
            mm=mm+aa[i];
        }
        aa[0]--;
        aa[1]++;


    }
    
    for(int i=1;i<num.length();i++){
        aa[i]=9;
    }
    long max=0;
    for(int i=0;i<num.length();i++){
        max=max+aa[i];
    }
    if(max>=mm){
    System.out.println(max);
    }
    if(mm>max){
        System.out.println(mm);
    }
    
    
    }
}