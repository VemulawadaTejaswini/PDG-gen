import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String coorString = sc.nextLine();
        String[] coord = coorString.split(" ");
        int x = Integer.valueOf(coord[0]);
        int y = Integer.valueOf(coord[1]);
        int firstTLocation = getLatestT(inputString);
        int firstMove = firstTLocation;
        x = x - firstMove;
        List<Integer> yNumbers = getNumbers(inputString);
        List<Integer> xNumbers = new ArrayList<>();
        if(firstTLocation<inputString.length()) {
            xNumbers = getNumbers(inputString.substring(firstTLocation+1));
        }

        boolean[][] values = new boolean[16001][xNumbers.size()];
        int j = 0;
        for(Integer xNumber: xNumbers) {
            if(j==0) {
                values[8000+xNumber][j] = true;
                values[8000-xNumber][j] = true;
            }
            else {
                for (int i = 0; i < 16001; i++) {
                    if(values[i][j-1]==true){
                        values[i+xNumber][j]=true;
                        values[i-xNumber][j]=true;
                    }
                }
            }
            j++;
        }
        int lastXNumber = xNumbers.size()-1;
        if(lastXNumber==-1)
        {
            if(x!=0) {
              System.out.println("No");
              return;
            }
        }
        else {
            if (values[8000 + x][lastXNumber] == false) {
                System.out.println("No");
                return;
            }
        }


        //Now for Y
        values = new boolean[16001][yNumbers.size()];
        j = 0;
        for(Integer yNumber: yNumbers) {
            if(j==0) {
                values[8000+yNumber][j] = true;
                values[8000-yNumber][j] = true;
            }
            else {
                for (int i = 0; i < 16001; i++) {
                    if(values[i][j-1]==true){
                        values[i+yNumber][j]=true;
                        values[i-yNumber][j]=true;
                    }
                }
            }
            j++;
        }

        int lastYNumber = yNumbers.size()-1;
        if(lastYNumber==-1)
        {
            if(y!=0) {
                System.out.println("No");
                return;
            }
        }
        else {
            if (values[8000 + y][lastYNumber] == false) {
                System.out.println("No");
                return;
            }
        }






        //


        System.out.println("Yes");
    }

    private static List<Integer> getNumbers(String inputString) {
        String leftOverString = inputString;
        List<Integer> values = new ArrayList<>();
        while(!leftOverString.equals("")) {
            int nextT = getLatestT(leftOverString);
            if(nextT<leftOverString.length()) {
                leftOverString = leftOverString.substring(nextT+1);
            }
            else {
                break;
            }
            int nextTT = getLatestT(leftOverString);
            if(nextTT<leftOverString.length()) {
                int value = nextTT;
                values.add(value);
                leftOverString = leftOverString.substring(nextTT+1);
            }
            else {
                int value = nextTT;
                values.add(value);
                break;
            }
        }
        return values;
    }

    private static int getLatestT(String leftOverString) {
        int i = 0;
        for( ; i<leftOverString.length(); i++ ) {
            if(leftOverString.charAt(i)=='T')
                return i;
        }
        return i;
    }

}