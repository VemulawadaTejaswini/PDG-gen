import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        Card[] a = new Card[n];
        for(int i = 0; i < n; i++){
            a[i] = new Card(sc.next().charAt(0), Integer.parseInt(sc.next()));
        }
        Card[] a2 = a.clone();
        
        quicksort(a, 0, n-1);
        mergeSort(a2, 0, n);
        boolean stable = true;
        for(int i = 0; i < n; i++){
            if(a[i].suit != a2[i].suit){
                stable = false;
                break;
            }
        }
        
        if(stable){
            System.out.println("Stable");
        }else{
            System.out.println("Not stable");
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(a[i].suit).append(" ").append(a[i].value).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
    
    static void quicksort(Card[] a, int p, int r){
        
        if(p < r){
            int q = partition(a, p, r);
            quicksort(a, p, q-1);
            quicksort(a, q+1, r);
        }
    }
    
    static int partition(Card[] a, int p, int r){
        
        int x = a[r].value;
        int i = p-1;
        for(int j = p; j < r; j++){
            if(a[j].value <= x){
                i++;
                Card k = a[i];
                a[i] = a[j];
                a[j] = k;
            }
        }
        Card k = a[i+1];
        a[i+1] = a[r];
        a[r] = k;
        return i+1;
    }
    
    static void merge(Card[] a, int left, int mid, int right){
        
        int n1 = mid - left;
        int n2 = right - mid;
        Card[] l = new Card[n1 +1];
        Card[] r = new Card[n2 +1];
        for(int i = 0; i < n1; i++){
            l[i] = a[left +i];
        }
        for(int i = 0; i < n2; i++){
            r[i] = a[mid +i];
        }
        l[n1] = new Card('M', Integer.MAX_VALUE);
        r[n2] = new Card('M', Integer.MAX_VALUE);
        int i = 0;
        int j = 0;
        for(int k = left; k < right; k++){
            if(l[i].value <= r[j].value){
                a[k] = l[i];
                i++;
            }else{
                a[k] = r[j];
                j++;
            }
        }
    }
    
    static void mergeSort(Card[] a, int left, int right){
        
        if(left+1 < right){
            int mid = (left + right)/2;
            mergeSort(a, left, mid);
            mergeSort(a, mid, right);
            merge(a, left, mid, right);
        }
    }
    
    static class Card {
        char suit;
        int value;

        public Card(char suit, int value) {
            this.suit = suit;
            this.value = value;
        }
    }
}
