public class Main{

public static void main(String[] args) {

        char arr[] = new Scanner(System.in).next().toCharArray();

        int sum = 0;

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {

            if (Integer.parseInt(String.valueOf(arr[i])) >= 1 && Integer.parseInt(String.valueOf(arr[i])) <= 10)
                counter++;

        }

        if (counter == arr.length) {
            for (int i = 0; i < arr.length; i++) {

                sum += Integer.parseInt(String.valueOf(arr[i]));
            }

            if (sum == 17)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        


    }
    }