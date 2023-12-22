class Main extends MyUtil{
    // public static ArrayList<ArrayList<Integer>> g;
    public static Graph g;
     
    public static void main(String[] args) throws Exception{
        int n = readInt();
        int[] a = readIntMap();
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = n-1; j > i; j--) {
                if(a[j] < a[j-1]){
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                    count++;
                }
            }
        }
        System.out.print(a[0]);
        for (int i = 1; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.println(count);
    }
}