import java.util.Arrays;
import java.util.Scanner;

class Main{
    private static char[] input;
    private static final char[] starts = {'(', '['};
    private static final char[] ends = {')', ']'};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String next;
        while(!(next = sc.nextLine()).equals(".")){
            input = next.toCharArray();
            System.out.println(calc() ? "yes" : "no");
        }
    }

    private static boolean calc(){
        int index;
        try{
            for(int i = 0; i < input.length; i++){
                if(Arrays.binarySearch(ends, input[i]) > -1) return false;
                if((index = Arrays.binarySearch(starts, input[i])) > -1) i = calc(i, index);
                if(i < 0) return false;
            }
        }catch (IndexOutOfBoundsException ignored){}
        return true;
    }

    private static int calc(int now, int target){
        int index;
        try{
            for(int i = now + 1; i < input.length; i++){
                if(input[i] == ends[target]) return i;
                if(input[i] == ends[(target + 1) % 2]) return -9;
                if((index = Arrays.binarySearch(starts, input[i])) > -1) i = ((index = calc(i, index)) == -1 ? input.length : index);
            }
        }catch (IndexOutOfBoundsException ignored){}
        return -9;
    }
}