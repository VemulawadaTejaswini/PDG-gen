import java.util.Scanner;

//解説を参考にした
class MakingTriangle {
    //三角形が存在するかのチェック
    static boolean checkTriangle(int[] a, int i, int j, int k) {
        if (a[i] + a[j] > a[k] && a[j] + a[k] > a[i] && a[k] + a[i] > a[j])
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int N = std.nextInt();
        /*
        Set<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < N; i++)
            hashSet.add(std.nextInt());

        Integer[] a = hashSet.toArray(new Integer[hashSet.size()]);
        */
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
            a[i] = std.nextInt();

        int count = 0;
        //組み合わせ
        for(int i = 0; i < a.length-2; i++) {
            for(int j = i + 1; j < a.length-1; j++) {
                for(int k = j + 1; k < a.length; k++) {
                    if(checkTriangle(a, i, j, k) && a[i] != a[j] && a[j] != a[k] && a[k] != a[i]) count++;
                }
            }
        }

        System.out.println(count);

    }

}
