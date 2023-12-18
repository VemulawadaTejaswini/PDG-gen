import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int n = word.length();
        int maximumLength = 0;
        boolean zFound = false;
        for (int i = 0; i < n; i++) {
            if(word.charAt(i) == 'A')
            {
                for (int j = i+1; j < n; j++) {
                    if(word.charAt(j) == 'Z')
                    {
                        zFound = true;
                        if(j-i+1 > maximumLength)
                        {
                            maximumLength = j - i + 1;
                        }
                    }
                    else if(zFound)
                    {
                        zFound = false;
                        break;
                    }
                }
            }
        }
        System.out.println(maximumLength);
        }
    }