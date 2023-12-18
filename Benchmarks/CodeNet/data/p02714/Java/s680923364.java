import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    private static char R = 'R';
    private static char G = 'G';
    private static char B = 'B';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        String S = sc.next();
        sc.close();

        char[] c = S.toCharArray();

        NavigableSet<Integer> setR = new TreeSet<>();
        NavigableSet<Integer> setG = new TreeSet<>();
        NavigableSet<Integer> setB = new TreeSet<>();
        NavigableSet<Integer> setRG = new TreeSet<>();
        NavigableSet<Integer> setGB = new TreeSet<>();
        NavigableSet<Integer> setBR = new TreeSet<>();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == R) {
                setR.add(Integer.valueOf(i + 1));
                setRG.add(Integer.valueOf(i + 1));
                setBR.add(Integer.valueOf(i + 1));
            } else if (c[i] == G) {
                setG.add(Integer.valueOf(i + 1));
                setRG.add(Integer.valueOf(i + 1));
                setGB.add(Integer.valueOf(i + 1));
            } else {
                setB.add(Integer.valueOf(i + 1));
                setGB.add(Integer.valueOf(i + 1));
                setBR.add(Integer.valueOf(i + 1));
            }
        }

        int ans = 0;
        for (int index = 0; index < c.length; index++) {
            Integer I = Integer.valueOf(index + 1);

            if (c[index] == R) {
                for (Integer J : setGB.tailSet(I)) {
                    int IJ = J - I;
                    if (c[J - 1] == G) {
                        for (Integer K : setB.tailSet(J)) {
                            if (K - J == IJ) {
                                continue;
                            }
                            ans++;
                        }
                    } else {
                        for (Integer K : setG.tailSet(J)) {
                            if (K - J == IJ) {
                                continue;
                            }
                            ans++;
                        }
                    }
                }

            } else if (c[index] == G) {
                for (Integer J : setBR.tailSet(I)) {
                    int IJ = J - I;
                    if (c[J - 1] == B) {
                        for (Integer K : setR.tailSet(J)) {
                            if (K - J == IJ) {
                                continue;
                            }
                            ans++;
                        }
                    } else {
                        for (Integer K : setB.tailSet(J)) {
                            if (K - J == IJ) {
                                continue;
                            }
                            ans++;
                        }
                    }
                }
            } else {
                for (Integer J : setRG.tailSet(I)) {
                    int IJ = J - I;
                    if (c[J - 1] == R) {
                        for (Integer K : setG.tailSet(J)) {
                            if (K - J == IJ) {
                                continue;
                            }
                            ans++;
                        }
                    } else {
                        for (Integer K : setR.tailSet(J)) {
                            if (K - J == IJ) {
                                continue;
                            }
                            ans++;
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
