import java.util.*;


public class Main{

    static ArrayList<Integer> A = new ArrayList<Integer>();
    static public int arriveCity;

    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();

        
        for(int i = 0; i < n; i++){
            A.add(sc.nextInt());
        }
        int startIndex = A.indexOf(1);
        int counter = 0;
        
        jumpCities(startIndex,counter,k);

        System.out.println(A.get(arriveCity));
        return;
    }    

    public static void jumpCities(int startIndex, int counter ,int jumpLimit){
        if(counter < jumpLimit){
            int newCounter = counter+1;
            arriveCity = A.get(startIndex)-1;
            jumpCities(arriveCity,newCounter,jumpLimit);

        }
    }
}