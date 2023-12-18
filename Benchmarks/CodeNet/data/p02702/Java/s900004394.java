import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");
        int count = 0;
        for(int i=0;i<str.length-3;i++){
            for(int j=i+3;j<str.length;j++){
                String suti = "0";
                StringBuilder a = new StringBuilder();
                for(int k=i;k<=j;k++){
                    a.append(str[k]); 
                }
                if(!"".equals(a.toString()) || a.toString() != null){
                    suti = a.toString();
                }
                int temp=0;
                for(int h=0;h<suti.length();h++){
                    temp = (temp*10+Character.getNumericValue(suti.charAt(h))) % 2019;
                }
                if(temp == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
