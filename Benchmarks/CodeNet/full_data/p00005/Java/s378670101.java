import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ans = new ArrayList<>();
        while(sc.hasNext()){
            long a = sc.nextLong(),b = sc.nextLong();
            ans.add(String.format("%d %d",getGCD(a,b),getLCM(a,b)));
        }
        for(int i = 0,size = ans.size();i < size;i++){
            System.out.println(ans.get(i));
        }
    }
    static long getGCD(long a,long b){
        while(a != b){
            if(a > b) a -= b;
            else b -= a;
        }
        return a;
    }
    static long getLCM(long a,long b){
        return a * b / getGCD(a,b);
    }
}