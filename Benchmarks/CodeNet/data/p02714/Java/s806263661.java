import java.util.Scanner;

public class Main {

    static char[] c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        c = S.toCharArray();
        long count = 0, tempCount;
        for(int j=0;j<N;j++){
            tempCount = 0;
            switch (c[j]){
                case 'R':
                    tempCount = findNumOf(j, 'G', true) * findNumOf(j, 'B', false);
                    tempCount += findNumOf(j, 'B', true) * findNumOf(j, 'G', false);
                    tempCount -= findEqualDest(j, 'R');
                    break;
                case 'G':
                    tempCount = findNumOf(j, 'R', true) * findNumOf(j, 'B', false);
                    tempCount += findNumOf(j, 'B', true) * findNumOf(j, 'R', false);
                    tempCount -= findEqualDest(j, 'G');
                    break;
                case 'B':
                    tempCount = findNumOf(j, 'G', true) * findNumOf(j, 'R', false);
                    tempCount += findNumOf(j, 'R', true) * findNumOf(j, 'G', false);
                    tempCount -= findEqualDest(j, 'B');
                    break;
            }
            count += tempCount;
        }
        System.out.println(count);
    }

    static long findNumOf(int endIndex, char toFind, boolean left){      //left=trueなら左側、falseなら右側を探索
        long count = 0;
        if(left){
            for (int i=0;i<endIndex;i++){
                if(c[i] == toFind){
                    count++;
                }
            }
        }else{
            for (int i=endIndex+1, n=c.length;i<n;i++){
                if(c[i] == toFind){
                    count++;
                }
            }
        }
        return count;
    }

    static int findEqualDest(int index, char cExcept){    //i==j&&j==kになる組の数。たかだかc.length/2しかないのでintでOK
        int count = 0;
        for(int i=1, n=c.length;i<n;i++){
            if(index-i < 0 || index+i >= n){
                break;
            }
            if(c[index-i] != cExcept && c[index+i] != cExcept && c[index-i] != c[index+i]){
                count++;
            }
        }
        return count;
    }
}
