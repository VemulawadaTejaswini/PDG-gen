import java.util.*;
public class Main {
    Scanner sc = new Scanner(System.in);
    Person [][] n = new Person[3][8];
    Person [] n2 = new Person[6];
     
    void doIt(){
    	for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 8 ; j++){
                n[i][j] = new Person(sc.nextInt() , sc.next()); 
            }
        } 
    	Arrays.sort(n[0]);
        Arrays.sort(n[1]);
        Arrays.sort(n[2]);
        n2[0] = new Person(n[0][2].n , n[0][2].time);
        n2[1] = new Person(n[0][3].n , n[0][3].time);
        n2[2] = new Person(n[1][2].n , n[1][2].time);
        n2[3] = new Person(n[1][3].n , n[1][3].time);
        n2[4] = new Person(n[2][2].n , n[2][2].time);
        n2[5] = new Person(n[2][3].n , n[2][3].time);
        Arrays.sort(n2);
        System.out.println(n[0][0]);
        System.out.println(n[0][1]);
        System.out.println(n[1][0]);
        System.out.println(n[1][1]);
        System.out.println(n[2][0]);
        System.out.println(n[2][1]);
        System.out.println(n2[0]);
        System.out.println(n2[1]);
    }
 
     
    public static void main(String[] args){
        new Main().doIt();
    }
     
    class Person implements Comparable<Person>{
        int n;
        String time;
        Person(int n , String time){
            this.n = n;
            this.time = time;   
        }
         
        @Override
        public int compareTo(Person p){
            return time.compareTo(p.time);
        }
         
        @Override
        public String toString(){
            return n + " " + time;
        }
         
    }
     
}