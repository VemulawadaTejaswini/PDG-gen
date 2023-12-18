import java.util.ArrayList;
import java.util.Scanner;

class Main {

    static class Path {
        final int u;
        final int v;
        final int s;

        Path(int u, int v, int s) {
            this.u = u;
            this.v = v;
            this.s = s;
        }
    }

    static class Peak {
        // v = ax + b
        int a = 1;
        int b = 0;

        Peak() {
            a = 1;
            b = 0;
        }
        Peak(int a, int b) {
            this.a = a;
            this.b = b;
        }

        Peak other(int s) {
            return new Peak(-a, s - b);
        }

        void add(int add) {
            b += add * a;
            a = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int n = Integer.parseInt(array[0]);
        int m = Integer.parseInt(array[1]);

        Peak[] peaks = null;
        ArrayList<Path> paths = new ArrayList<Path>();
        boolean fixed = false;

        for (int i = 0; i < m; ++i) {
            String[] array2 = scanner.nextLine().split(" ");
            int u = Integer.parseInt(array2[0]);
            int v = Integer.parseInt(array2[1]);
            int s = Integer.parseInt(array2[2]);

            if (peaks == null) {
                peaks = new Peak[n + 1];
                Peak start = new Peak();
                peaks[u] = start;
                peaks[v] = start.other(s);
            } else if (peaks[u] != null) {
                Peak other = peaks[u].other(s);
                if (peaks[v] != null) {
                    Peak prep = peaks[v];
                    if (prep.a == other.a) {
                        if (prep.b != other.b) {
                            System.out.println(0);
                            return;
                        }
                    } else {
                        //int a = prep.a - other.a;
                        int b = (prep.b * prep.a) + (other.b * other.a);
                        if ((b % 2) == 0) {
                            fixed = true;
                            int add = b / 2;
                            for (int j = 1; j < peaks.length; ++j) {
                                if (peaks[j] != null) {
                                    peaks[j].add(add * -1);
                                }
                            }
                        } else {
                            System.out.println(0);
                            return;
                        }
                    }
                } else {
                    peaks[v] = other;
                }
            } else if (peaks[v] != null) {
                peaks[u] = peaks[v].other(s);
            } else {
                paths.add(new Path(u, v, s));
            }
        }

        while (paths.size() > 0) {
            ArrayList<Path> currentPaths = paths;
            paths = new ArrayList<Path>();

            for (Path path : currentPaths) {
                int u = path.u;
                int v = path.v;
                int s = path.s;
                if (peaks[u] != null) {
                    Peak other = peaks[u].other(s);
                    if (peaks[v] != null) {
                        Peak prep = peaks[v];
                        if (prep.a == other.a) {
                            if (prep.b != other.b) {
                                System.out.println(0);
                                return;
                            }
                        } else {
                            int a = prep.a + other.a;
                            int b = prep.b + other.b;
                            if ((b % a) == 0) {
                                fixed = true;
                                int add = b / a;
                                for (int j = 1; j < peaks.length; ++j) {
                                    if (peaks[j] != null) {
                                        peaks[j].add(add);
                                    }
                                }
                            } else {
                                System.out.println(0);
                                return;
                            }
                        }
                    } else {
                        peaks[v] = other;
                    }
                } else if (peaks[v] != null) {
                    peaks[u] = peaks[v].other(s);
                } else {
                    paths.add(path);
                }
            }
        }

        if (fixed) {
            for (int i = 1; i < peaks.length; ++i) {
                if (peaks[i].b < 1) {
                    System.out.println(0);
                    return;
                }
            }

            System.out.println(1);
        } else {
            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;
            for (int i = 1; i < peaks.length; ++i) {
                if (peaks[i].a > 0) {
                    min = Math.max(min, 1 - peaks[i].b);
                } else {
                    max = Math.min(max, peaks[i].b - 1);
                }
            }

            if (max >= min) {
                System.out.println(max - min + 1);
            } else {
                System.out.println(0);
            }
        }
    }
}