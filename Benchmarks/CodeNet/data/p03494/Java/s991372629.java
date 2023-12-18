
public int answerB(int n, int[] array) {
    int result = 0;
    int[] next = new int[n];

    for (int j = 0; j < n; j++) {
        next[j] = array[j];
    }

    for (int i = 0; i < n; i++) {
        if (next[i] % 2 == 1) {
            break;
        }
        else {
            next[i] = next[i] / 2;
            if (i == n -1) {
                result++;
            }
        }
    }

    return result;
}