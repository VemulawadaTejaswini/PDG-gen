public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        char[] testchars = new char[W];
        List<int[]> blacks = new ArrayList<>();
        List<int[]> whites = new ArrayList<>();
        int counts = 0;
        String test = sc.nextLine();
        for (int i = 0; i<H; i++){
            test = sc.nextLine();
            testchars = test.toCharArray();
//            System.out.println(test);
            for (int j = 0; j<W; j++){
                if (testchars[j] == '#') {
                    blacks.add(new int[]{i, j});
//                    System.out.println("blk");
                } else {
                    whites.add(new int[] {i,j});
//                    System.out.println("wht");
                    counts++;
                }
            }
        }
        int[] dist = new int[counts];
        for (int i=0;i<dist.length;i++)
            dist[i] = Integer.MAX_VALUE;
        int idx = 0;
        for (int[] w: whites) {
            for (int[] b: blacks) {
                if (dist[idx] > Math.abs(w[0]-b[0])+Math.abs(w[1]-b[1])) {
                    dist[idx] = Math.abs(w[0]-b[0])+Math.abs(w[1]-b[1]);
                }
            }
            idx++;
        }
        Arrays.sort(dist);
        System.out.println(dist[counts-1]);
    }
}