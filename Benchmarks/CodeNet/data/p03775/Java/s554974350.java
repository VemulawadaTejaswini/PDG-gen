import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        int input;
        int larger;
        ArrayList<Integer> value = new ArrayList<Integer>();
        input=cin.nextInt();
        for(int i=1;i*i<=input;i++){
            if(input%i==0){
                larger=(int)input/i;
                value.add(String.valueOf(larger).length());
            }
        }
        Collections.sort(value);
        System.out.println(value.get(0));
        }
    }
