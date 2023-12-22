import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        String a_card = null;
        String b_card = null;
        int a_point = 0;
        int b_point = 0;

        int j = 0;
        int i = 0;
      
        while(i < m){
            
            a_card = scan.next().toLowerCase();
            b_card = scan.next().toLowerCase();


            while(true){
                if(a_card.charAt(j) > b_card.charAt(j)){
                    a_point += 3;
                    break;

                }else if(a_card.charAt(j) == b_card.charAt(j) && j == a_card.length()){
                    a_point++;
                    b_point++;
                    break;
                }else if(a_card.charAt(j) == b_card.charAt(j)){
                    j++;
                }else if(a_card.charAt(j) < b_card.charAt(j)){
                    b_point += 3;
                    break;
                }
            }
            
            i++;
        }
        
        System.out.println(a_point + " " + b_point);

    }
}

