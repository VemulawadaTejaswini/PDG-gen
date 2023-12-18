import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Satisfaction> aList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Satisfaction s = new Satisfaction();
            s.setA(sc.nextInt());
            s.setB(sc.nextInt());
            s.culcS();
            aList.add(s);
        }
        Collections.sort(aList, new Comparator<Satisfaction>(){
            @Override
            public int compare(Satisfaction s1, Satisfaction s2){
                if(s1.getS() == s2.getS()){
                    return 0;
                }
                return s1.getS() - s2.getS() > 0 ? 1 : -1;
            }
        });
        long tPoint = 0;
        int tIndex = 0;
        long aPoint = 0;
        int aIndex = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                tPoint += aList.get(i).getA();
            }else{
                aPoint += aList.get(i).getB();
            }
        }
        System.out.println(tPoint - aPoint);
    }
    
    public static class Satisfaction{
        private long a;
        private long b;
        private long s;
        private boolean canGet = true;
        
        public void setA(long a){
            this.a = a;
        }
        
        public void setB(long b){
            this.b = b;
        }
        
        public void setS(long s){
            this.s = s;
        }

        public void culcS(){
            s = a + b;
        }
        
        public long getA(){
            return a;
        }
        
        public long getB(){
            return b;
        }
        
        public long getS(){
            return s;
        }

        public boolean canGet(){
            return canGet;
        }
        
        public void setCanGet(boolean canGet){
            this.canGet = canGet;
        }
    }
}
