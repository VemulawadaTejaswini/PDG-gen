import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String S;
        StringBuilder S_List = new StringBuilder();
        S = sc.next();
        S_List.append(S);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int a=0;a<S.length()-1;a++){
            if((S_List.charAt(a)=='1'&&S_List.charAt(a+1)=='0')||(S_List.charAt(a)=='0'&&S_List.charAt(a+1)=='1')){
                int num=S_List.length()-(a+1);
                if(num>a){
                    for(int b=a+1;b<S_List.length();b++){
                           if(S_List.charAt(a) =='1') S_List.setCharAt(a,'0');
                        else S_List.setCharAt(a,'1');
                    }
                    if(num>=2) list2.add(num);
                }
                else if(num<=a){
                    if(a!=0)list2.add(a+1);
                }
            }
        }
        System.out.println(Collections.min(list2));
    }
}
