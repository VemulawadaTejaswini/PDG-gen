import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int arrayLeng = sc.nextInt();
        int[] insSort = new int[arrayLeng];
        
        for(int i = 0; i < insSort.length; i++){
            insSort[i] = sc.nextInt();
        }
        
        InsertionSort is = new InsertionSort(insSort);
        is.insSortOutPut();
        is.numOfChange();
    }
}

class InsertionSort{
    int[] insSort;
    public InsertionSort(int[] insSort){
        this.insSort = insSort;
    }
    
    public void numOfChange(){
        int minNum = 0;
        for(int i = 0,j; i < insSort.length; i++){
            if( i == 0 ){
                continue;
            }
            minNum = insSort[i];
            j = i - 1;
            while( j >= 0 && insSort[j] > minNum){
                insSort[j + 1] = insSort[j];
                j--;
            }
            insSort[j + 1] = minNum;
            insSortOutPut();
        }
    }
    
    public void insSortOutPut(){
        System.out.print(insSort[0]);
        for(int i = 1; i < insSort.length; i++){
            System.out.print(" " + insSort[i]);
        }
        System.out.print("\n");
    }
}
