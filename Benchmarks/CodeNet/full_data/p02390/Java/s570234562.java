# -*- coding: utf-8 -*-
"""
Watch
"""
if __name__ == '__main__':
    t = int(raw_input())
    h = t / 3600
    m = (t - 3600 * h) / 60
    s = t % 60
    print('{0}:{1}:{2}'.format(h, m, s))
