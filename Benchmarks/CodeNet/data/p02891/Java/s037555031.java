import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder s = new StringBuilder(scanner.nextLine());
        int k = scanner.nextInt();

        // for(int i = 0; i < k; i++){
        //     s.append(s);
        // }

        long count = 0;
        s.append(s);

        for(int i = 0; i < s.length()-1; i++){
            if(s.substring(i, i+1).equals(s.substring(i+1, i+2))){
                count++;
                i++;
            }
        }

        if(count % 2 == 0){
            System.out.println(count/2 * k);
        }else{
            System.out.println((count-1)/2 * k + 1);
        }


        scanner.close();
    }
}