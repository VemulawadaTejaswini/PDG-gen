import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int output=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()+1;j++){
                if(str.substring(i,j).replaceAll("A", "").replaceAll("C","").replaceAll("G", "").replaceAll("T","").length()==0){
                    if(output<j-i){
                        output=j-i;
                    }
                }
            }
        }
        System.out.println(output);
    }
}