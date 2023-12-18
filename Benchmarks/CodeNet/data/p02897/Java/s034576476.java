int N;
void _main() {
    cin >> N;
    int cnt = (N + 1) / 2;
    double ans = 1.0 * cnt / N;
    printf("%.10f\n", ans);
}