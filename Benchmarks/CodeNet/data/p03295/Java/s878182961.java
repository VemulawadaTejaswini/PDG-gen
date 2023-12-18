import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanNumber = new Scanner(System.in);

        int howIland = scanNumber.nextInt();

        int howWar = scanNumber.nextInt();

        int[] ilandEnemyA;
        ilandEnemyA = new int[howWar];

        int[] ilandEnemyB;
        ilandEnemyB = new int[howWar];

        for(int i=0; i <= howWar-1 ; i++){

            ilandEnemyA[i] = scanNumber.nextInt();
            ilandEnemyB[i] = scanNumber.nextInt();

        }

        scanNumber.close();

        int howNeedBreage = 0;

        List<Integer> ilands = new ArrayList<Integer>();

        for(int i=0; i <= howIland ; i++){

            for(int j=0; j <= howWar-1 ; j++){
                if(ilands.size() < 2){
                    break;
                }
                if(ilands.contains(ilandEnemyA[j]) && ilands.contains(ilandEnemyB[j])){
                    howNeedBreage++;
                    ilands.clear();
                    ilands.add(i);
                    break;
                }
            }

            ilands.add(i+1);
        }
        System.out.print(howNeedBreage);

    }
}
