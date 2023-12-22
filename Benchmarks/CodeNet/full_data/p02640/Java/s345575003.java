import java.util.Scanner;

public class Main {
    static boolean countAnimals(int animal, int legs){
        int count =0;
        
        if(animal>51) return false; 
        count = Math.abs(legs- 4*(animal));
        count = count/2;
        
        int y = animal-count;
        
        if((2*count + 4*y)==legs){
            System.out.println(count);
            System.out.println(y);
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int animal = scan.nextInt();
        int legs = scan.nextInt();
        //crane has 2 legs
        //turtle has 4 legs
        if(countAnimals(animal,legs))
            System.out.println("Yes");
        else
            System.out.println("No");
}
}