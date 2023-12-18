import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        int length = Integer.valueOf(input1);
        input1 = sc.nextLine();
        String[] inputs = input1.split(" ");
        int[] numbers = new int[length];
        for(int i=0;i<length;i++) {
            numbers[i] = Integer.valueOf(inputs[i]);
        }
        int sum = 0;
        boolean allZero = false;
        int start = 0;
        int k = 0;
        boolean minFound = false;
        while(allZero==false) {
            allZero=true;
            int min = Integer.MAX_VALUE;
            start = 0;
            for(int i = 0; i<length;i++) {
                if(numbers[i]!=0)
                {
                    if( numbers[i]< min ) {
                        min = numbers[i];
                        minFound = true;
                    }
                    allZero=false;
                }

                if(numbers[i]==0 || i==length-1)
                {
                    int end = i-1;
                    if(numbers[i]!=0) {
                        end = end+1;
                    }
                    //System.out.println("min: "+ min);
                    for(int j = start ; j<=end;j++) {
                        //System.out.println(j+": "+numbers[j]);
                        numbers[j] = numbers[j]-min;
                        //System.out.println(j+": "+numbers[j]);
                        //System.out.println();
                    }

                    if(minFound) {
                        minFound = false;
                        sum = sum + min;
                    }
                    start = i+1;
                    min = Integer.MAX_VALUE;
                }

            }
        }
        System.out.println(sum);
    }
}