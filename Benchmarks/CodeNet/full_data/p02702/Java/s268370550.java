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
                if(Long.parseLong(suti) % 2019 == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
