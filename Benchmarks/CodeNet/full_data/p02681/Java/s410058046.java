import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String str11 = sc.nextLine();
        String[] str1 = str11.split("");

        String str21 = sc.nextLine();
        String[] str2 = str21.split("");

        sc.close();
        String ans = "";
        if( Character.isUpperCase( str11.charAt( 0 ) ) ||Character.isUpperCase( str21.charAt( 0 ) ) ){
            ans="No";
        }
        if(str1.length>10 || str1.length<1){
            ans = "No";
        }else if((str1.length+1) != str2.length){
            ans="No";
        }else if(str1[str1.length-1].equals(str2[str1.length-1])){
            for(int i=0; i<(str1.length-1); i++){
                if(!(str1[i].equals(str2[i]))){
                    ans = "No";
                    break;
                }
            }
            if(ans.equals("")){
                ans="Yes";
            }
        }
        System.out.println(ans);
    }
}