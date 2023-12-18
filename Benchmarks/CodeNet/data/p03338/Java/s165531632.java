import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        int n;
        String s;
        int[] maxV=new int[101];
        int max=0;
        int count=0;
        Scanner sc = new Scanner(System.in);


        n = sc.nextInt();


        s = sc.next();


        String[] abc={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        if(2<=n&n<=100){
           for (int index = 1; index < s.length(); index ++) {
             count=0;
          String x = s.substring(0,index);
          String y = s.substring(index);
            for(int roop =0; roop<=25; roop ++){
              if(x.contains(abc[roop])&y.contains(abc[roop])){
                count++;
              }

            }
            maxV[index]=count;
             max = Math.max(max,maxV[index]);
        }


        System.out.println(max);

        }


    }
}