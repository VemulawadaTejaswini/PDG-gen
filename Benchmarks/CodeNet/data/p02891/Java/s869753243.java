import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder s = new StringBuilder(scanner.nextLine());

        

        long k = scanner.nextLong();

        

        // for(int i = 0; i < k; i++){
        //     s.append(s);
        // }

        long count = 0;

        for(int i = 0; i < s.length()-1; i++){
            if(s.substring(i, i+1).equals(s.substring(i+1, i+2))){
                count++;
                i++;
            }
        }

        long countExtra = 0;
        s.append(s.substring(0, 1));

        for(int i = 0; i < s.length()-1; i++){
            if(s.substring(i, i+1).equals(s.substring(i+1, i+2))){
                countExtra++;
                i++;
            }
        }

        // if(s.length() == 2){
        //     System.out.println(k-1);
        // }else if(count % 2 == 0){
        //     System.out.println(count/2 * k);
        // }else{
        //     System.out.println((count-1)/2 * k + 1);
        // }

        if(s.length() == 2){
            System.out.println(k/2);
        }else if(count == countExtra){
            System.out.println(countExtra * k);
        }else if(count != countExtra){
            System.out.println(countExtra * k -1);
        }


        scanner.close();
    }
}