import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        String N = sc.next();
        String year[]=new String[99];
        int count=0;
        for(int i=1;i<=N.length();i++){
            year[i]=String.valueOf(2019*i);
            for(int k=0;k<(1+N.length())-(year[i]).length();k++){
                if(N.substring(k,k+(year[i].length())).equals(year[i])){
                    count++;
                  //System.out.println(k+" "+k+(year[i].length())+" "+i);
                  //System.out.println(N.substring(k,k+(year[i].length())));
                }
              //System.out.println(N.substring(k,k+(year[i].length())));
            }
        }
        System.out.println(count);
    }
}