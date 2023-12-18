import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Hako> arraySt = new ArrayList<Hako>();
        String sta = sc.next();
        char[] cha = sta.toCharArray();
        Arrays.sort(cha);
        arraySt.add(new Hako(new String(cha)));
        for(int i = 1;i<n;i++){
            String st = sc.next();
            char[] ch = st.toCharArray();
            Arrays.sort(ch);
            String hikaku = new String(ch);
            boolean seikou = true;
            for(int j = 0;j<arraySt.size();j++){
                if(arraySt.get(j).isString(hikaku)){
                    arraySt.get(j).numPlus();
                    seikou = false;
                    break;
                }
            }
            if(seikou){
                arraySt.add(new Hako(new String(hikaku)));
            }
        }
        int result = 0;
        for(int i = 0;i<arraySt.size();i++){
           result += arraySt.get(i).resultNum(); 
        }
        System.out.println(result);
        sc.close();
    }
}

class Hako{
    String st;
    int num;
    public Hako(String s){
        st = s;
        num = 0;
    }
    public void numPlus(){
        num++;
    }
    public int resultNum(){
        return (int)(num * (num + 1) / 2);
    }
    public boolean isString(String s){
        return st.equals(s);
    }
}