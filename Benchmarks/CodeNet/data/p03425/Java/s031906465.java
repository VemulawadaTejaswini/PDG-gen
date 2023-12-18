import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s[] = new String[n];
        int mCount = 0;
        int aCount = 0;
        int rCount = 0;
        int cCount = 0;
        int hCount = 0;
        for(int i=0;i<n;i++){
            s[i] = scanner.next();
            switch(s[i].charAt(0)){
                case 'M':
                    mCount++;
                    break;
                case 'A':
                    aCount++;
                    break;
                case 'R':
                    rCount++;
                    break;
                case 'C':
                    cCount++;
                    break;
                case 'H':
                    hCount++;
                    break;
            }
        }
        int allCount = 0;
        allCount += mCount * aCount * rCount;
        allCount += mCount * aCount * cCount;
        allCount += mCount * aCount * hCount;
        allCount += mCount * rCount * cCount;
        allCount += mCount * rCount * hCount;
        allCount += mCount * cCount * hCount;
        allCount += aCount * rCount * cCount;
        allCount += aCount * rCount * hCount;
        allCount += aCount * cCount * hCount;
        allCount += rCount * cCount * hCount;
        System.out.println(allCount);
    }

}